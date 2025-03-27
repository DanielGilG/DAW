package org.dgg.Komponisten.controller;

import com.sun.tools.javac.Main;
import org.dgg.Komponisten.controller.IoC.ComposerIoC;
import org.dgg.Komponisten.domain.entity.Composer;
import org.dgg.Komponisten.domain.service.ComposerService;
import org.dgg.Komponisten.domain.service.impl.ComposerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;


@Controller
public class MainController {
    private final ComposerService composerService;

    public MainController(){
        this.composerService = ComposerIoC.createService();
    }

    @SuppressWarnings("SameReturnValue")
    @GetMapping("/")
    public String index(Model model){
        List<Composer> composers = composerService.findAll();
        model.addAttribute("composers", composers);
        return "index";
    }
}
