package com.adamglin.phosphoricons.light;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.LightGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Readcvlogo.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"ReadCvLogo", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getReadCvLogo", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_readCvLogo", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ReadcvlogoKt {
    private static ImageVector _readCvLogo;

    public static final ImageVector getReadCvLogo(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _readCvLogo;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("ReadCvLogo", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(210.43f, 41.22f);
        pathBuilder.lineToRelative(-130.25f, -23.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 64.0f, 29.58f);
        pathBuilder.lineToRelative(-29.75f, 169.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 11.36f, 16.22f);
        pathBuilder.lineToRelative(130.25f, 23.0f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.arcToRelative(13.64f, 13.64f, 0.0f, false, false, 2.46f, 0.22f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 226.42f);
        pathBuilder.lineToRelative(29.75f, -169.0f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 210.43f, 41.22f);
        pathBuilder.close();
        pathBuilder.moveTo(210.0f, 55.36f);
        pathBuilder.lineToRelative(-29.75f, 169.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.82f, 1.3f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.49f, 0.33f);
        pathBuilder.lineTo(47.65f, 203.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 200.64f);
        pathBuilder.lineToRelative(29.75f, -169.0f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.82f, -1.3f);
        pathBuilder.arcTo(2.06f, 2.06f, 0.0f, false, true, 78.1f, 30.0f);
        pathBuilder.lineTo(208.35f, 53.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 55.36f);
        pathBuilder.close();
        pathBuilder.moveTo(186.11f, 75.51f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f);
        pathBuilder.arcToRelative(6.2f, 6.2f, 0.0f, false, true, -1.05f, -0.09f);
        pathBuilder.lineToRelative(-83.0f, -14.66f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.09f, -11.81f);
        pathBuilder.lineToRelative(83.0f, 14.65f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 186.11f, 75.51f);
        pathBuilder.close();
        pathBuilder.moveTo(180.56f, 107.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.9f, 5.0f);
        pathBuilder.arcToRelative(5.48f, 5.48f, 0.0f, false, true, -1.0f, -0.1f);
        pathBuilder.lineToRelative(-83.0f, -14.65f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.09f, -11.82f);
        pathBuilder.lineToRelative(83.0f, 14.66f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 180.56f, 107.0f);
        pathBuilder.close();
        pathBuilder.moveTo(133.56f, 131.19f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.91f, 4.95f);
        pathBuilder.arcToRelative(6.38f, 6.38f, 0.0f, false, true, -1.05f, -0.09f);
        pathBuilder.lineToRelative(-41.49f, -7.33f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, true, 2.09f, -11.81f);
        pathBuilder.lineToRelative(41.49f, 7.32f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 133.53f, 131.22f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _readCvLogo = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
