package com.example.command.room;

public class AddFurnitureCommand implements Command {

    private Furniture furniture;

    public AddFurnitureCommand(Furniture furniture) {
        this.furniture = furniture;
    }

    @Override
    public void execute() {
        System.out.println("Added " + furniture.getType().name().toLowerCase() + " in room: " + furniture.description());
    }
}
