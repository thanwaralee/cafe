package ku.cs.cafe.controller;

import ku.cs.cafe.model.CategoryRequest;
import ku.cs.cafe.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 ---------------------------------
 // Thanwaralee thanestummaroj
 // 6410450150
 ---------------------------------
 **/

@Controller
@RequestMapping("/categories")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @GetMapping("/add")
    public String getCategoryForm(Model model) {
        return "category-add";
    }

    @PostMapping("/add")
    public String createCategory(@ModelAttribute CategoryRequest request,
                                 Model model) {
        categoryService.createCategory(request);
        return "redirect:/menus";
    }
}


