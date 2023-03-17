package com.example.state.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AudioPlayer {
  private State state;
  private boolean isPlaying;

  public AudioPlayer() {
    this.state = new ReadyState(this);
  }
  
  public void changeState(State state) {
    this.state = state;
  }
  
  public void startPlayback(){
    changeState(new PlayingState(getState().player));
    System.out.println("Start play");
  }
  
  public void stopPlayback(){
    System.out.println("Stop play");
  }
  
  public void nextSong() {
    System.out.println("Play next song");
  }
  
  public void previousSong() {
    System.out.println("Play previous song");
  }
}
