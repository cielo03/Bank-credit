package sn.isi.bankcredit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class RoleController {
    @GetMapping("/listesroles")
    public String list() {
        return "roles/listroles";
    }

    @GetMapping("/addroles")
    public String add() {
        return "roles/addroles";
    }
}
