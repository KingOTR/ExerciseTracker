package com.example.rungps.ui.home;

import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.platform.client.SdkConfig;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: SleepGymNudgeCard.kt */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"SleepGymNudgeCard", "", "sleepEntries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "fmt", "", "h", "", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepGymNudgeCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepGymNudgeCard$lambda$1(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepGymNudgeCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepGymNudgeCard$lambda$2(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepGymNudgeCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepGymNudgeCard$lambda$3(List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepGymNudgeCard(list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepGymNudgeCard(final List<SleepEntryEntity> sleepEntries, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Iterator<T> it;
        Object obj;
        Composer composer2;
        Intrinsics.checkNotNullParameter(sleepEntries, "sleepEntries");
        Composer startRestartGroup = composer.startRestartGroup(1528814726);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(sleepEntries) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                final Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1528814726, i3, -1, "com.example.rungps.ui.home.SleepGymNudgeCard (SleepGymNudgeCard.kt:15)");
                }
                it = sleepEntries.iterator();
                if (it.hasNext()) {
                    obj = null;
                } else {
                    Object next = it.next();
                    if (it.hasNext()) {
                        long endTimeMs = ((SleepEntryEntity) next).getEndTimeMs();
                        do {
                            Object next2 = it.next();
                            long endTimeMs2 = ((SleepEntryEntity) next2).getEndTimeMs();
                            if (endTimeMs < endTimeMs2) {
                                next = next2;
                                endTimeMs = endTimeMs2;
                            }
                        } while (it.hasNext());
                    }
                    obj = next;
                }
                if (((SleepEntryEntity) obj) != null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup != null) {
                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.home.SleepGymNudgeCardKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit SleepGymNudgeCard$lambda$1;
                                SleepGymNudgeCard$lambda$1 = SleepGymNudgeCardKt.SleepGymNudgeCard$lambda$1(sleepEntries, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return SleepGymNudgeCard$lambda$1;
                            }
                        });
                        return;
                    }
                    return;
                }
                double effectiveAsleepMinutes = SleepScoring.INSTANCE.effectiveAsleepMinutes(r3.getTotalSleepMin(), r3.getStartTimeMs(), r3.getEndTimeMs(), r3.getSource()) / 60.0d;
                if (effectiveAsleepMinutes >= 6.25d) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                    if (endRestartGroup2 != null) {
                        endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.home.SleepGymNudgeCardKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                Unit SleepGymNudgeCard$lambda$2;
                                SleepGymNudgeCard$lambda$2 = SleepGymNudgeCardKt.SleepGymNudgeCard$lambda$2(sleepEntries, modifier3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                                return SleepGymNudgeCard$lambda$2;
                            }
                        });
                        return;
                    }
                    return;
                }
                Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                TextKt.m2376Text4IGK_g(effectiveAsleepMinutes < 5.0d ? "Very short night (" + fmt(effectiveAsleepMinutes) + ") — consider lighter gym volume or extra rest today." : "Short night (" + fmt(effectiveAsleepMinutes) + ") — you may want to ease gym intensity today.", modifier4, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyMedium(), composer2, i3 & SdkConfig.SDK_VERSION, 0, 65528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
            if (endRestartGroup3 != null) {
                endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.ui.home.SleepGymNudgeCardKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Unit SleepGymNudgeCard$lambda$3;
                        SleepGymNudgeCard$lambda$3 = SleepGymNudgeCardKt.SleepGymNudgeCard$lambda$3(sleepEntries, modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        return SleepGymNudgeCard$lambda$3;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        it = sleepEntries.iterator();
        if (it.hasNext()) {
        }
        if (((SleepEntryEntity) obj) != null) {
        }
    }

    private static final String fmt(double d) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f h", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
