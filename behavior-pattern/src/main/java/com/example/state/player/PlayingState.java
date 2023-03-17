package com.example.state.player;

public class PlayingState extends State {

  public PlayingState(AudioPlayer player) {
    super(player);
  }

  @Override
  void clickLock() {
    player.changeState(new LockedState(player));
  }

  @Override
  void clickPlay() {
    player.stopPlayback();
    player.changeState(new ReadyState(player));
  }

  @Override
  void clickNext() {
    player.nextSong();
  }

  @Override
  void clickPrevious() {
    player.previousSong();
  }
}
