
import br.com.pages.NovoUsuarioPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.screenshot;

@Listeners({ ScreenShooter.class})
public class NovoUsuarioTestes {

    Faker faker = new Faker();
    NovoUsuarioPage usuario = new NovoUsuarioPage();

    @BeforeClass
    public static void setup(){
        Configuration.baseUrl= "https://srbarriga.herokuapp.com";
    }


    @Test
    public void criarNovoUsuario() {
       usuario.abrir();
       usuario.preencherNome("Bruno Carvalho")
              .prrencherEmail(faker.internet().emailAddress())
              .preencherSenha("123456789").clicarBotaoCadastrar();
       screenshot("Criar Novo Usuario");
    }
}
