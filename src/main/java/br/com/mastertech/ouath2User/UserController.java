package br.com.mastertech.ouath2User;

import br.com.mastertech.ouath2User.security.Usuario;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("/user")
    public Usuario create(@AuthenticationPrincipal Usuario usuario) {
        usuario.getName();
        return usuario;
    }
}
