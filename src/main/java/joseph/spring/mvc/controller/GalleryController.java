package joseph.spring.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class GalleryController {

    @GetMapping("/gallery/list")
    public String list(){
        return "gallery/list.tiles";
    }
    @GetMapping("/gallery/view")
    public String view(){
        return "gallery/view.tiles";
    }
    @GetMapping("/gallery/write")
    public String write(){
        return "gallery/write.tiles";
    }
}
