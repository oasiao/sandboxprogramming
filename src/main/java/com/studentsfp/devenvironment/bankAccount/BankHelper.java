package com.studentsfp.devenvironment.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class BankHelper {
    public static List<Client> clientList = new ArrayList<>();
    public static List<Bank> bankList = new ArrayList<>();
    public static List<Card> cardList = new ArrayList<>();
    public static List<Account> accountList = new ArrayList<>();

    //constructor (métodos con el nombre de la clase sin retorno)
    public BankHelper(){
        if(clientList.isEmpty()){
            initData();
        }
    }


    //método que inserte en la base de datos
    //inserto un cliente
    public void initData(){
        Client client = new Client(2222222222L,"Pepito","2222222","Calle molina","oekfsm@gmail.com","4444433299");
        //clientList.add(new Client(2222222222L,"Pepito","2222222","Calle molina","oekfsm@gmail.com","4444433299"));//hay que basarse en el constructor que hemos creado
        clientList.add(client);
    }


}
