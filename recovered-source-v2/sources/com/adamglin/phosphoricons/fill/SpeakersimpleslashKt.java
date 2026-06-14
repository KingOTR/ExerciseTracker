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

/* compiled from: Speakersimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getSpeakerSimpleSlash", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakersimpleslashKt {
    private static ImageVector _speakerSimpleSlash;

    public static final ImageVector getSpeakerSimpleSlash(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _speakerSimpleSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SpeakerSimpleSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(221.92f, 210.62f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f);
        pathBuilder.lineTo(168.0f, 175.09f);
        pathBuilder.verticalLineToRelative(48.6f);
        pathBuilder.arcToRelative(8.29f, 8.29f, 0.0f, false, true, -3.91f, 7.18f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.0f, -0.56f);
        pathBuilder.lineTo(85.25f, 176.0f);
        pathBuilder.horizontalLineTo(40.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f);
        pathBuilder.verticalLineTo(96.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 80.0f);
        pathBuilder.horizontalLineTo(81.55f);
        pathBuilder.lineTo(50.08f, 45.38f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 61.92f, 34.62f);
        pathBuilder.close();
        pathBuilder.moveTo(200.53f, 160.0f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, -8.25f);
        pathBuilder.verticalLineTo(104.27f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 200.53f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.53f, 8.0f);
        pathBuilder.verticalLineToRelative(48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 200.53f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(161.0f, 119.87f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.0f, -2.7f);
        pathBuilder.verticalLineTo(32.24f);
        pathBuilder.arcToRelative(8.25f, 8.25f, 0.0f, false, false, -2.88f, -6.39f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -10.0f, -0.16f);
        pathBuilder.lineTo(111.83f, 59.33f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.5f, 5.85f);
        pathBuilder.close();
        pathBuilder.moveTo(231.47f, 80.0f);
        pathBuilder.arcTo(8.17f, 8.17f, 0.0f, false, false, 224.0f, 88.27f);
        pathBuilder.verticalLineToRelative(79.46f);
        pathBuilder.arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f);
        pathBuilder.verticalLineTo(88.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 231.47f, 80.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
