package com.example.state.player;

public class LockedState extends State {

  public LockedState(AudioPlayer player) {
    super(player);
  }

  @Override
  void clickLock() {
    if (player.isPlaying()) {
      System.out.println("Player is locked");
      player.changeState(new LockedState(player));
    } else {
      player.changeState(new ReadyState(player));
    }
  }

  @Override
  void clickPlay() {
    
  }

  @Override
  void clickNext() {
    
  }

  @Override
  void clickPrevious() {
    
  }
}
