package com.example.rungps.ui.theme;

import androidx.compose.material3.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Type.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"DisplayFont", "Landroidx/compose/ui/text/font/GenericFontFamily;", "BodyFont", "DataFont", "style", "Landroidx/compose/ui/text/TextStyle;", "family", "Landroidx/compose/ui/text/font/FontFamily;", "size", "Landroidx/compose/ui/unit/TextUnit;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "lineHeight", "letterSpacing", "style-AFGpsPM", "(Landroidx/compose/ui/text/font/FontFamily;JLandroidx/compose/ui/text/font/FontWeight;JJ)Landroidx/compose/ui/text/TextStyle;", "ExerciseTrackerTypography", "Landroidx/compose/material3/Typography;", "getExerciseTrackerTypography", "()Landroidx/compose/material3/Typography;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TypeKt {
    private static final GenericFontFamily BodyFont;
    private static final GenericFontFamily DataFont;
    private static final GenericFontFamily DisplayFont;
    private static final Typography ExerciseTrackerTypography;

    static {
        GenericFontFamily serif = FontFamily.INSTANCE.getSerif();
        DisplayFont = serif;
        GenericFontFamily serif2 = FontFamily.INSTANCE.getSerif();
        BodyFont = serif2;
        GenericFontFamily monospace = FontFamily.INSTANCE.getMonospace();
        DataFont = monospace;
        ExerciseTrackerTypography = new Typography(m7657styleAFGpsPM(serif, TextUnitKt.getSp(36), FontWeight.INSTANCE.getBold(), TextUnitKt.getSp(42), TextUnitKt.getSp(-0.5d)), m7657styleAFGpsPM(serif, TextUnitKt.getSp(32), FontWeight.INSTANCE.getBold(), TextUnitKt.getSp(38), TextUnitKt.getSp(-0.25d)), m7658styleAFGpsPM$default(serif, TextUnitKt.getSp(28), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(34), 0L, 16, null), m7657styleAFGpsPM(serif, TextUnitKt.getSp(26), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(32), TextUnitKt.getSp(-0.2d)), m7658styleAFGpsPM$default(serif, TextUnitKt.getSp(22), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(28), 0L, 16, null), m7658styleAFGpsPM$default(serif, TextUnitKt.getSp(20), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(26), 0L, 16, null), m7658styleAFGpsPM$default(serif, TextUnitKt.getSp(18), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(24), 0L, 16, null), m7657styleAFGpsPM(serif2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getMedium(), TextUnitKt.getSp(22), TextUnitKt.getSp(0.05d)), m7657styleAFGpsPM(serif2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getMedium(), TextUnitKt.getSp(20), TextUnitKt.getSp(0.08d)), m7657styleAFGpsPM(serif2, TextUnitKt.getSp(16), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(24), TextUnitKt.getSp(0.12d)), m7657styleAFGpsPM(serif2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(21), TextUnitKt.getSp(0.12d)), m7657styleAFGpsPM(serif2, TextUnitKt.getSp(14), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(20), TextUnitKt.getSp(0.14d)), m7657styleAFGpsPM(monospace, TextUnitKt.getSp(13), FontWeight.INSTANCE.getNormal(), TextUnitKt.getSp(18), TextUnitKt.getSp(0.2d)), m7657styleAFGpsPM(monospace, TextUnitKt.getSp(13), FontWeight.INSTANCE.getLight(), TextUnitKt.getSp(18), TextUnitKt.getSp(0.22d)), m7657styleAFGpsPM(monospace, TextUnitKt.getSp(12), FontWeight.INSTANCE.getLight(), TextUnitKt.getSp(16), TextUnitKt.getSp(0.26d)));
    }

    /* renamed from: style-AFGpsPM$default, reason: not valid java name */
    static /* synthetic */ TextStyle m7658styleAFGpsPM$default(FontFamily fontFamily, long j, FontWeight fontWeight, long j2, long j3, int i, Object obj) {
        return m7657styleAFGpsPM(fontFamily, j, fontWeight, j2, (i & 16) != 0 ? TextUnitKt.getSp(0) : j3);
    }

    /* renamed from: style-AFGpsPM, reason: not valid java name */
    private static final TextStyle m7657styleAFGpsPM(FontFamily fontFamily, long j, FontWeight fontWeight, long j2, long j3) {
        return new TextStyle(0L, j, fontWeight, (FontStyle) null, (FontSynthesis) null, fontFamily, (String) null, j3, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, j2, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16645977, (DefaultConstructorMarker) null);
    }

    public static final Typography getExerciseTrackerTypography() {
        return ExerciseTrackerTypography;
    }
}
