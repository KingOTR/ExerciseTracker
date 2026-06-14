package com.adamglin.phosphoricons.fill;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.FillGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Speakerslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSpeakerSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakerslashKt {
    private static ImageVector _speakerSlash;

    public static final ImageVector getSpeakerSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _speakerSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpeakerSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(213.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(160.0f, 175.09f);
        pathBuilder.verticalLineToRelative(48.6f);
        pathBuilder.arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, 7.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -0.56f);
        pathBuilder.lineToRelative(-65.55f, -51.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 176.18f);
        pathBuilder.lineTo(80.0f, 87.09f);
        pathBuilder.lineTo(42.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, true, true, 53.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(186.71f, 155.16f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.29f, -0.7f);
        pathBuilder.arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -52.88f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -12.0f, 10.57f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 31.72f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 186.71f, 155.16f);
        pathBuilder.close();
        pathBuilder.moveTo(227.63f, 74.67f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.92f, 10.66f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, true, 0.0f, 85.34f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.92f, 10.66f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, false, false, 0.0f, -106.66f);
        pathBuilder.close();
        pathBuilder.moveTo(153.0f, 119.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.7f);
        pathBuilder.lineTo(160.0f, 32.25f);
        pathBuilder.arcToRelative(8.27f, 8.27f, 0.0f, false, false, -2.88f, -6.4f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -0.16f);
        pathBuilder.lineTo(103.83f, 59.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, 5.85f);
        pathBuilder.close();
        pathBuilder.moveTo(60.0f, 80.0f);
        pathBuilder.lineTo(32.0f, 80.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.lineTo(60.0f, 176.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f);
        pathBuilder.lineTo(64.0f, 84.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 60.0f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
