import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ContaTeste {

    @Test
    public void aoSacarUmValorDeUmaContaOSaldoDeveSofrerUmaSubtracaoDesseValor(){
        Conta conta = new Conta(200);
        conta.sacar(50 );

        assertThat(conta.getSaldo(), is(equalTo(150d)));
    }
}
