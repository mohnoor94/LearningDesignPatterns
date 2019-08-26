package _13_command._01_command;

import com.google.common.collect.Lists;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        final BankAccount bankAccount = new BankAccount();

        System.out.println(bankAccount);

        final List<BankAccountCommand> commands = List.of(
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.DEPOSIT, 100),
                new BankAccountCommand(bankAccount, BankAccountCommand.Action.WITHDRAW, 1000)
        );

        commands.forEach(c -> {
            c.call();
            System.out.println(bankAccount);
        });

        System.out.println("=================================");

        // Undo
        Lists.reverse(commands).forEach(c -> {
            c.undo();
            System.out.println(bankAccount);
        });
    }
}
