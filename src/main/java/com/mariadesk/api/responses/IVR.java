package com.mariadesk.api.responses;

import com.twilio.twiml.VoiceResponse;
import com.twilio.twiml.Dial;
import com.twilio.twiml.Number;

public class IVR extends Response {
  private final String digits;
  private final String agentNumber;

  public IVR(String digits, String agentNumber) {
    this.digits = digits;
    this.agentNumber = agentNumber;
  }

  public VoiceResponse response() {
    return null;
  }
}
