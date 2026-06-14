package com.adamglin.phosphoricons.thin;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.ThinGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Speakerslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SpeakerSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getSpeakerSlash", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_speakerSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpeakerslashKt {
    private static ImageVector _speakerSlash;

    public static final ImageVector getSpeakerSlash(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(51.0f, 37.31f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f);
        pathBuilder.lineTo(81.0f, 82.19f);
        pathBuilder.lineTo(78.63f, 84.0f);
        pathBuilder.lineTo(32.0f, 84.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 96.0f);
        pathBuilder.verticalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f);
        pathBuilder.lineTo(78.63f, 172.0f);
        pathBuilder.lineToRelative(70.91f, 55.16f);
        pathBuilder.arcTo(4.07f, 4.07f, 0.0f, false, false, 152.0f, 228.0f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.76f, -0.41f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, false, 156.0f, 224.0f);
        pathBuilder.lineTo(156.0f, 164.75f);
        pathBuilder.lineToRelative(49.0f, 53.94f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f);
        pathBuilder.close();
        pathBuilder.moveTo(28.0f, 160.0f);
        pathBuilder.lineTo(28.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.lineTo(76.0f, 92.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.lineTo(32.0f, 164.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 160.0f);
        pathBuilder.close();
        pathBuilder.moveTo(148.0f, 215.82f);
        pathBuilder.lineTo(84.0f, 166.0f);
        pathBuilder.lineTo(84.0f, 90.0f);
        pathBuilder.lineToRelative(2.35f, -1.83f);
        pathBuilder.lineTo(148.0f, 156.0f);
        pathBuilder.close();
        pathBuilder.moveTo(189.0f, 146.52f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -37.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.0f, -5.29f);
        pathBuilder.arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 47.59f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, -5.29f);
        pathBuilder.close();
        pathBuilder.moveTo(109.0f, 65.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.7f, -5.61f);
        pathBuilder.lineToRelative(39.85f, -31.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 156.0f, 32.0f);
        pathBuilder.verticalLineToRelative(74.83f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(148.0f, 40.18f);
        pathBuilder.lineToRelative(-33.39f, 26.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 109.0f, 65.45f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 128.0f);
        pathBuilder.arcToRelative(75.88f, 75.88f, 0.0f, false, true, -19.35f, 50.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, -5.34f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, -90.66f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.0f, -5.34f);
        pathBuilder.arcTo(75.88f, 75.88f, 0.0f, false, true, 244.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _speakerSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
