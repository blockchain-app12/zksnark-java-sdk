package org.kcoin.common.zksnark;

import java.io.IOException;
import org.kcoin.common.util.Utils;

public class LibsodiumWrapper {
  private static final Libsodium INSTANCE = new Libsodium();

  static {
    try {
      System.load(Utils.getLibraryByName("libzksnarkjni"));
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  public static Libsodium getInstance() {
    return INSTANCE;
  }

}
