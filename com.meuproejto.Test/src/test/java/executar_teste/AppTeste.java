package executar_teste;

import static org.junit.Assert.*;

import org.junit.Test;
import junit.framework.TestCase;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		glue= 	    {"definicoesTestes"},
		//features= {"./src/test/java/features/test01PreencherFormulario.feature"}
		//features= {"./src/test/java/features/test02VerficarBotoes.feature"}
		features=   {"./src/test/java/features/test03PreencherAlertas.feature"}
)

public class AppTeste {
	
}
