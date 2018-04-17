package com.xhh.springboot.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 16/01/25.
 */
public class JsonDateSerializer extends JsonSerializer<Date> {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
            throws IOException {

        String formattedDate = dateFormat.format(date);

        gen.writeString(formattedDate);
    }
}