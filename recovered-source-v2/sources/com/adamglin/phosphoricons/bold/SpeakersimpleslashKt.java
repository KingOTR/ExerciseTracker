package com.adamglin.phosphoricons.bold;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.BoldGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Speakersimpleslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerSimpleSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getSpeakerSimpleSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerSimpleSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakersimpleslashKt {
    private static ImageVector _speakerSimpleSlash;

    public static final ImageVector getSpeakerSimpleSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(248.0f, 88.0f);
        pathBuilder.verticalLineToRelative(80.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(224.0f, 88.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f);
        pathBuilder.close();
        pathBuilder.moveTo(224.88f, 207.93f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.76f, 16.14f);
        pathBuilder.lineTo(172.0f, 185.44f);
        pathBuilder.lineTo(172.0f, 224.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.37f, 9.47f);
        pathBuilder.lineTo(83.88f, 180.0f);
        pathBuilder.lineTo(40.0f, 180.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f);
        pathBuilder.lineTo(20.0f, 96.0f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 76.0f);
        pathBuilder.lineTo(72.51f, 76.0f);
        pathBuilder.lineTo(47.12f, 48.07f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 64.88f, 31.93f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 159.0f);
        pathBuilder.lineTo(94.33f, 100.0f);
        pathBuilder.lineTo(44.0f, 100.0f);
        pathBuilder.verticalLineToRelative(56.0f);
        pathBuilder.lineTo(88.0f, 156.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.37f, 2.53f);
        pathBuilder.lineTo(148.0f, 199.46f);
        pathBuilder.close();
        pathBuilder.moveTo(133.85f, 67.5f);
        pathBuilder.lineTo(148.0f, 56.5f);
        pathBuilder.verticalLineToRelative(38.4f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f);
        pathBuilder.lineTo(172.0f, 32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.37f, -9.47f);
        pathBuilder.lineTo(119.12f, 48.6f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 14.73f, 18.94f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 150.94f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f);
        pathBuilder.lineTo(212.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f);
        pathBuilder.verticalLineToRelative(34.94f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 150.94f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerSimpleSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
