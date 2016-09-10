package org.twgogo.jimwayne.gson.deserialization;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.lang.String;
import java.time.LocalDate;

public class Quote {
  @Expose
  @SerializedName(value="date", alternate="epoch_day")
  private long epoch;

  @Expose
  @SerializedName(value="id", alternate="symbol_mic")
  private String symbol;

  public void setEpochDay (long value) {
    this.epoch = value;
  }

  public long getEpochDay() {
    return this.epoch;
  }

  public void setSymbolMic(String value) {
    this.symbol = value;
  }

  public String getSymbolMic() {
    return this.symbol;
  }
}
