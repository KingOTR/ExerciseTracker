package com.example.rungps.ui.main;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.feature.run.RunsViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.osmdroid.util.GeoPoint;

/* compiled from: MapTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$15 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<GeoPoint>> $plannedPts$delegate;
    final /* synthetic */ MutableState<String> $routeName$delegate;
    final /* synthetic */ MutableState<Boolean> $showSaveRoute$delegate;
    final /* synthetic */ RunsViewModel $vm;

    MapTabContentKt$MapTabContent$15(MutableState<Boolean> mutableState, MutableState<String> mutableState2, RunsViewModel runsViewModel, MutableState<List<GeoPoint>> mutableState3) {
        this.$showSaveRoute$delegate = mutableState;
        this.$routeName$delegate = mutableState2;
        this.$vm = runsViewModel;
        this.$plannedPts$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List MapTabContent$lambda$6;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(354099075, i, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous> (MapTabContent.kt:934)");
            }
            composer.startReplaceGroup(-1385859256);
            boolean changed = composer.changed(this.$showSaveRoute$delegate) | composer.changed(this.$routeName$delegate) | composer.changedInstance(this.$vm);
            final RunsViewModel runsViewModel = this.$vm;
            final MutableState<Boolean> mutableState = this.$showSaveRoute$delegate;
            final MutableState<String> mutableState2 = this.$routeName$delegate;
            final MutableState<List<GeoPoint>> mutableState3 = this.$plannedPts$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$15$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = MapTabContentKt$MapTabContent$15.invoke$lambda$3$lambda$2(RunsViewModel.this, mutableState, mutableState2, mutableState3);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            MapTabContent$lambda$6 = MapTabContentKt.MapTabContent$lambda$6(this.$plannedPts$delegate);
            ButtonKt.Button(function0, null, MapTabContent$lambda$6.size() >= 2, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7224getLambda20$app_sideload(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(RunsViewModel runsViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
        String MapTabContent$lambda$25;
        List MapTabContent$lambda$6;
        List MapTabContent$lambda$62;
        MapTabContentKt.MapTabContent$lambda$22(mutableState, false);
        MapTabContent$lambda$25 = MapTabContentKt.MapTabContent$lambda$25(mutableState2);
        String obj = StringsKt.trim((CharSequence) MapTabContent$lambda$25).toString();
        if (obj.length() == 0) {
            obj = "Route " + System.currentTimeMillis();
        }
        String str = obj;
        MapTabContent$lambda$6 = MapTabContentKt.MapTabContent$lambda$6(mutableState3);
        double plannedDistanceKm = MainActivityFormattersKt.plannedDistanceKm(MapTabContent$lambda$6) * 1000.0d;
        MapTabContent$lambda$62 = MapTabContentKt.MapTabContent$lambda$6(mutableState3);
        List<GeoPoint> list = MapTabContent$lambda$62;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (GeoPoint geoPoint : list) {
            arrayList.add(TuplesKt.to(Double.valueOf(geoPoint.getLatitude()), Double.valueOf(geoPoint.getLongitude())));
        }
        runsViewModel.saveRoute(str, plannedDistanceKm, arrayList);
        return Unit.INSTANCE;
    }
}
