package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GymSetLoggedTime.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymSetLoggedTimeKt$SetTimeEditDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LocalDateTime $initial;
    final /* synthetic */ Function1<Long, Unit> $onSave;
    final /* synthetic */ MutableState<String> $text$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    GymSetLoggedTimeKt$SetTimeEditDialog$1(MutableState<String> mutableState, LocalDateTime localDateTime, Function1<? super Long, Unit> function1) {
        this.$text$delegate = mutableState;
        this.$initial = localDateTime;
        this.$onSave = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1195272373, i, -1, "com.example.rungps.ui.gym.SetTimeEditDialog.<anonymous> (GymSetLoggedTime.kt:70)");
            }
            composer.startReplaceGroup(-1611582391);
            boolean changed = composer.changed(this.$text$delegate) | composer.changedInstance(this.$initial) | composer.changed(this.$onSave);
            final LocalDateTime localDateTime = this.$initial;
            final Function1<Long, Unit> function1 = this.$onSave;
            final MutableState<String> mutableState = this.$text$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$SetTimeEditDialog$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = GymSetLoggedTimeKt$SetTimeEditDialog$1.invoke$lambda$1$lambda$0(localDateTime, function1, mutableState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GymSetLoggedTimeKt.INSTANCE.m7074getLambda1$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.time.ZonedDateTime] */
    public static final Unit invoke$lambda$1$lambda$0(LocalDateTime localDateTime, Function1 function1, MutableState mutableState) {
        String SetTimeEditDialog$lambda$12;
        Integer intOrNull;
        Integer intOrNull2;
        SetTimeEditDialog$lambda$12 = GymSetLoggedTimeKt.SetTimeEditDialog$lambda$12(mutableState);
        Intrinsics.checkNotNullExpressionValue(SetTimeEditDialog$lambda$12, "access$SetTimeEditDialog$lambda$12(...)");
        List split$default = StringsKt.split$default((CharSequence) StringsKt.trim((CharSequence) SetTimeEditDialog$lambda$12).toString(), new String[]{":"}, false, 0, 6, (Object) null);
        String str = (String) CollectionsKt.getOrNull(split$default, 0);
        if (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return Unit.INSTANCE;
        }
        int intValue = intOrNull.intValue();
        String str2 = (String) CollectionsKt.getOrNull(split$default, 1);
        if (str2 == null || (intOrNull2 = StringsKt.toIntOrNull(str2)) == null) {
            return Unit.INSTANCE;
        }
        int intValue2 = intOrNull2.intValue();
        if (intValue < 0 || intValue >= 24 || intValue2 < 0 || intValue2 >= 60) {
            return Unit.INSTANCE;
        }
        function1.invoke(Long.valueOf(localDateTime.withHour(intValue).withMinute(intValue2).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()));
        return Unit.INSTANCE;
    }
}
