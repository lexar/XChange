/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.vircurex;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import com.xeiam.xchange.currency.CurrencyPair;

/**
 * A central place for shared Vircurex properties
 */
public final class VircurexUtils {

  /**
   * private Constructor
   */
  private VircurexUtils() {

  }

  public static final List<CurrencyPair> CURRENCY_PAIRS = new ArrayList<CurrencyPair>();

  static {

    CURRENCY_PAIRS.add(CurrencyPair.LTC_BTC);
    CURRENCY_PAIRS.add(CurrencyPair.TRC_BTC);
    CURRENCY_PAIRS.add(CurrencyPair.PPC_BTC);
    CURRENCY_PAIRS.add(CurrencyPair.PPC_BTC);
    CURRENCY_PAIRS.add(new CurrencyPair("DGC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("NMC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("NVC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("TRC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("DVC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("IXC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("FRC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("FTC", "LTC"));
    CURRENCY_PAIRS.add(CurrencyPair.NMC_BTC);
    CURRENCY_PAIRS.add(CurrencyPair.BTC_USD);
    CURRENCY_PAIRS.add(new CurrencyPair("DVC", "BTC"));
    CURRENCY_PAIRS.add(new CurrencyPair("ANC", "BTC"));
    CURRENCY_PAIRS.add(CurrencyPair.LTC_BTC);
  }

  public static String getUtcTimestamp() {

    DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    format.setTimeZone(TimeZone.getTimeZone("GMT"));
    return format.format(new Date());
  }

}
