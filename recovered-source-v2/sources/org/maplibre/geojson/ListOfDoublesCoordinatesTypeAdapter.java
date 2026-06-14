package org.maplibre.geojson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* loaded from: classes5.dex */
class ListOfDoublesCoordinatesTypeAdapter extends BaseCoordinatesTypeAdapter<List<Double>> {
    ListOfDoublesCoordinatesTypeAdapter() {
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, List<Double> list) throws IOException {
        writePointList(jsonWriter, list);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public List<Double> mo7884read(JsonReader jsonReader) throws IOException {
        return readPointList(jsonReader);
    }
}
