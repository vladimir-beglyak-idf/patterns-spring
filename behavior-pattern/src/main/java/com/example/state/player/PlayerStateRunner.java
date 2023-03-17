package com.example.state.player;

public class PlayerStateRunner {

  public static void main(String[] args) {
    AudioPlayer audioPlayer = new AudioPlayer();
    System.out.println(audioPlayer.getState());
    
    audioPlayer.stopPlayback();
    System.out.println(audioPlayer.getState());
    
    audioPlayer.startPlayback();
    System.out.println(audioPlayer.getState());
    audioPlayer.getState().clickLock();
    System.out.println(audioPlayer.getState());
  }

}
