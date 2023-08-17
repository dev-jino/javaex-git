package chapter06;

public class FinalMethodEx {
  public static void main(String[] args) {

  }
}

class Chess {
  enum ChessPlayer {
    WHITE, BLACK
  }
  final ChessPlayer getFirstPlayer() {
    return ChessPlayer.WHITE;
  }
}

class WorldChess extends Chess {
//  @Override
//  ChessPlayer getFirstPlayer() {
//    return ChessPlayer.BLACK;
//  } // final 메소드는 오버라이드할 수 없음
}