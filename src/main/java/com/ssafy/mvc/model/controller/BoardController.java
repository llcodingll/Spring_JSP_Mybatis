package com.ssafy.mvc.model.controller;

import com.ssafy.mvc.model.dto.Board;
import com.ssafy.mvc.model.service.BoardService;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class BoardController {
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/board/write")
    public String writeForm() {
        return "board/write";
    }

    @PostMapping("/board/write")
    public String write(@ModelAttribute Board board,
        @RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            String fileName = UUID.randomUUID() + "_" + file.getOriginalFilename();
            file.transferTo(new File("uploads/" + fileName));
            board.setFileName(fileName);
            board.setOriginalFileName(file.getOriginalFilename());
        }
        boardService.write(board);
        return "redirect:/board/list";
    }

    @GetMapping("/board/list")
    public String list(@RequestParam(required = false) String keyword, Model model) {
        model.addAttribute("list", boardService.list(keyword));
        return "board/list";
    }

    @GetMapping("/board/detail/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("board", boardService.detail(id));
        return "board/detail";
    }

    @GetMapping("/board/edit/{id}")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("board", boardService.detail(id));
        return "board/edit";
    }

    @PostMapping("/board/edit")
    public String edit(Board board) {
        boardService.edit(board);
        return "redirect:/board/detail/" + board.getId();
    }

    @GetMapping("/board/delete/{id}")
    public String delete(@PathVariable Long id) {
        boardService.delete(id);
        return "redirect:/board/list";
    }
}
