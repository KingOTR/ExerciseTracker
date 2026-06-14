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

/* compiled from: Filetsx.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"FileTsx", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getFileTsx", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_fileTsx", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiletsxKt {
    private static ImageVector _fileTsx;

    public static final ImageVector getFileTsx(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
        ImageVector imageVector = _fileTsx;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("FileTsx", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(211.25f, 154.33f);
        pathBuilder.lineTo(192.92f, 180.0f);
        pathBuilder.lineToRelative(18.33f, 25.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.93f, 5.58f);
        pathBuilder.arcTo(3.91f, 3.91f, 0.0f, false, true, 208.0f, 212.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.26f, -1.67f);
        pathBuilder.lineTo(188.0f, 186.88f);
        pathBuilder.lineToRelative(-16.75f, 23.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.51f, -4.66f);
        pathBuilder.lineTo(183.08f, 180.0f);
        pathBuilder.lineToRelative(-18.34f, -25.67f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.51f, -4.66f);
        pathBuilder.lineTo(188.0f, 173.12f);
        pathBuilder.lineToRelative(16.74f, -23.45f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.51f, 4.66f);
        pathBuilder.close();
        pathBuilder.moveTo(122.49f, 175.15f);
        pathBuilder.curveToRelative(-10.53f, -3.0f, -15.08f, -4.91f, -14.42f, -10.08f);
        pathBuilder.arcToRelative(8.51f, 8.51f, 0.0f, false, true, 3.75f, -6.49f);
        pathBuilder.curveToRelative(6.25f, -4.23f, 18.77f, -2.24f, 23.06f, -1.11f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.05f, -7.74f);
        pathBuilder.arcToRelative(61.33f, 61.33f, 0.0f, false, false, -10.48f, -1.61f);
        pathBuilder.curveToRelative(-8.12f, -0.54f, -14.54f, 0.75f, -19.1f, 3.82f);
        pathBuilder.arcToRelative(16.66f, 16.66f, 0.0f, false, false, -7.22f, 12.13f);
        pathBuilder.curveToRelative(-1.58f, 12.49f, 10.46f, 16.0f, 20.14f, 18.77f);
        pathBuilder.curveToRelative(11.26f, 3.25f, 16.47f, 5.49f, 15.64f, 11.94f);
        pathBuilder.arcToRelative(8.94f, 8.94f, 0.0f, false, true, -3.91f, 6.75f);
        pathBuilder.curveToRelative(-6.27f, 4.17f, -18.61f, 2.05f, -22.83f, 0.88f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, false, -2.15f, 7.7f);
        pathBuilder.arcTo(57.89f, 57.89f, 0.0f, false, false, 121.19f, 212.0f);
        pathBuilder.curveToRelative(5.18f, 0.0f, 10.83f, -0.86f, 15.22f, -3.77f);
        pathBuilder.arcToRelative(17.0f, 17.0f, 0.0f, false, false, 7.43f, -12.41f);
        pathBuilder.curveTo(145.64f, 181.84f, 132.26f, 178.0f, 122.49f, 175.15f);
        pathBuilder.close();
        pathBuilder.moveTo(80.0f, 148.0f);
        pathBuilder.lineTo(40.0f, 148.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f);
        pathBuilder.lineTo(56.0f, 156.0f);
        pathBuilder.verticalLineToRelative(52.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f);
        pathBuilder.lineTo(64.0f, 156.0f);
        pathBuilder.lineTo(80.0f, 156.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f);
        pathBuilder.close();
        pathBuilder.moveTo(212.0f, 88.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(204.0f, 92.0f);
        pathBuilder.lineTo(152.0f, 92.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f);
        pathBuilder.lineTo(148.0f, 36.0f);
        pathBuilder.lineTo(56.0f, 36.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f);
        pathBuilder.verticalLineToRelative(72.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(44.0f, 40.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 1.17f);
        pathBuilder.lineToRelative(56.0f, 56.0f);
        pathBuilder.arcTo(4.0f, 4.0f, 0.0f, false, true, 212.0f, 88.0f);
        pathBuilder.close();
        pathBuilder.moveTo(198.34f, 84.0f);
        pathBuilder.lineTo(156.0f, 41.65f);
        pathBuilder.lineTo(156.0f, 84.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _fileTsx = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
