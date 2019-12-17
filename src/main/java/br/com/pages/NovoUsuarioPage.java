package br.com.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class NovoUsuarioPage {

    public NovoUsuarioPage abrir(){
        Selenide.open("/cadastro");
        return this;
    }

    public NovoUsuarioPage preencherNome(String nome) {
        $(By.id("nome")).val(nome);
        return this;
    }

    public NovoUsuarioPage prrencherEmail(String email){
        $(By.id("email")).val(email);
        return this;
    }

    public NovoUsuarioPage preencherSenha(String senha){
        $(By.id("senha")).val(senha);
        return this;
    }

     public NovoUsuarioPage clicarBotaoCadastrar(){
        $(By.xpath("//input[@value='Cadastrar']")).click();
        return this;
     }

}
