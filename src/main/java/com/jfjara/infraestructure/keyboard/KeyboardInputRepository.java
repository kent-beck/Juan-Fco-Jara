package com.jfjara.infraestructure.keyboard;

import com.jfjara.domain.repository.InputRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KeyboardInputRepository implements InputRepository {

    private Scanner scanner = new Scanner(System.in);

    private String readWidthAndHeight() {
        System.out.print("Set width and height: ");
        return scanner.nextLine();
    }

    private String readStartPosition() {
        System.out.print("Set start position: ");
        return scanner.nextLine();
    }

    private String readCommands() {
        System.out.print("Set commands: ");
        return scanner.nextLine();
    }

    @Override
    public List<String> readData() {
        return Arrays.asList(readWidthAndHeight(),
                readStartPosition(),
                readCommands(),
                readStartPosition(),
                readCommands());
    }
}
