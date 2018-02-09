package com.mariadesk.api.responses;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.Gather;
import com.twilio.twiml.Say;
import com.mariadesk.utils.Strings;


public class Questions extends Response {
  private String digits;

  public Questions(String digits) {
    this.digits = digits;
  }

  public VoiceResponse response() {
    return null;
  }

}
