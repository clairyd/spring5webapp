package guru.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
@Controller
public class AuthorController {

        private final AuthorRepository authorRepository;

        public AuthorController(AuthorRepository authorRepository) {
            this.authorRepository = authorRepository;
        }

        @RequestMapping("/books")
        public String getAuthors(Model model){

            model.addAttribute("author", authorRepository.findAll());

            return "authors/list";
        }
    }