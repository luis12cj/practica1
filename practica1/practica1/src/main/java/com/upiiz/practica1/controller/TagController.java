package com.upiiz.practica1.controller;

import com.upiiz.practica1.model.HtmlTag;
import com.upiiz.practica1.service.TagService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TagController {

    private final TagService tagService;

    // Inyección de dependencias
    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    // Ruta para la página principal (Listado por categorías)
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("categories", tagService.getTagsByCategory());
        return "index"; // Apunta a index.html
    }

    // Ruta para la página individual de cada etiqueta
    @GetMapping("/tag/{name}")
    public String tagDetail(@PathVariable String name, Model model) {
        HtmlTag tag = tagService.getTagByName(name);

        if (tag == null) {
            return "redirect:/"; // Si escriben mal la URL, los regresa al inicio
        }

        model.addAttribute("tag", tag);
        model.addAttribute("prevTag", tagService.getPreviousTag(name));
        model.addAttribute("nextTag", tagService.getNextTag(name));

        return "tag-detail"; // Apunta a tag-detail.html
    }
}