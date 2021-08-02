package chunbao.nl.event.readonly.controller;

import chunbao.nl.event.module.GuiUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user-rest")
public class UserController {
  @GetMapping(value = "/{username}", produces = "application/json")
  public GuiUser getUser(@PathVariable String username) {
    GuiUser myUser = new GuiUser();
    myUser.setUsername(username);
    myUser.setPassword("PW:" + username);
    return myUser;
  }
}
