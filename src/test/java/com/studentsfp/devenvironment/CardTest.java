package com.studentsfp.devenvironment;

import com.studentsfp.devenvironment.bankAccount.Account;
import com.studentsfp.devenvironment.bankAccount.BankHelper;
import com.studentsfp.devenvironment.bankAccount.Card;
import com.studentsfp.devenvironment.bankAccount.Client;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.util.Assert;

@SpringBootConfiguration
public class CardTest {

    @Test
    void generateClientCard() {
        //creamos las nuevas nuevas variables
        String cardNumber = "12345678";
        String DNI = "1234512";
        Integer pinCode = 1234;
        Client client = new Client();
        Card card = new Card();
        Account account = new Account();
        BankHelper bankHelper = new BankHelper(); //permite llamar los métodos del BankHelper

        card.setCardNumber(cardNumber);
        card.setPinCode(pinCode);
        card.setClient(BankHelper.clientList.get(0));
    }

    @Test
    void generateClient() {
        String name="Pepito";
        String nif;
        String address;
        String phone;
        String email;
        Long id=22222222222222222L;
        Client client = new Client(id, name, "22222", "acsc", "acsdcdv", "222222");
        Assert.isTrue(StringUtils.equals(name,client.getName()),"El nombre no coincide"); //comprobariamos con la clase StringUtils que el nombre == al nombre del cliente
        //Assert me obligar poner un mensaje al final.
        }


}
