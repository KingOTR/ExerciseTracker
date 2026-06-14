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

/* compiled from: Pencilslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPencilSlash", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilslashKt {
    private static ImageVector _pencilSlash;

    public static final ImageVector getPencilSlash(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pencilSlash;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilSlash", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(52.44f, 36.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f);
        pathBuilder.lineTo(93.05f, 98.47f);
        pathBuilder.lineTo(38.1f, 153.42f);
        pathBuilder.arcToRelative(13.9f, 13.9f, 0.0f, false, false, -4.1f, 9.89f);
        pathBuilder.lineTo(34.0f, 208.0f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f);
        pathBuilder.lineTo(92.69f, 222.0f);
        pathBuilder.arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f);
        pathBuilder.lineTo(154.46f, 166.0f);
        pathBuilder.lineToRelative(49.11f, 54.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f);
        pathBuilder.close();
        pathBuilder.moveTo(119.72f, 127.84f);
        pathBuilder.lineTo(68.0f, 179.52f);
        pathBuilder.lineTo(48.48f, 160.0f);
        pathBuilder.lineToRelative(52.65f, -52.64f);
        pathBuilder.close();
        pathBuilder.moveTo(46.0f, 208.0f);
        pathBuilder.lineTo(46.0f, 174.48f);
        pathBuilder.lineTo(81.52f, 210.0f);
        pathBuilder.lineTo(48.0f, 210.0f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f);
        pathBuilder.close();
        pathBuilder.moveTo(96.0f, 207.51f);
        pathBuilder.lineTo(76.49f, 188.0f);
        pathBuilder.lineToRelative(51.31f, -51.31f);
        pathBuilder.lineToRelative(18.58f, 20.45f);
        pathBuilder.close();
        pathBuilder.moveTo(225.91f, 74.79f);
        pathBuilder.lineTo(181.22f, 30.1f);
        pathBuilder.arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f);
        pathBuilder.lineTo(119.75f, 71.77f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, 8.49f);
        pathBuilder.lineTo(136.0f, 72.48f);
        pathBuilder.lineTo(155.52f, 92.0f);
        pathBuilder.lineToRelative(-9.11f, 9.1f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.49f);
        pathBuilder.lineToRelative(9.1f, -9.11f);
        pathBuilder.lineTo(183.52f, 120.0f);
        pathBuilder.lineToRelative(-10.44f, 10.44f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.49f, 8.48f);
        pathBuilder.lineToRelative(44.34f, -44.33f);
        pathBuilder.arcTo(14.0f, 14.0f, 0.0f, false, false, 225.91f, 74.79f);
        pathBuilder.close();
        pathBuilder.moveTo(217.42f, 86.1f);
        pathBuilder.lineTo(192.0f, 111.52f);
        pathBuilder.lineTo(168.25f, 87.76f);
        pathBuilder.horizontalLineToRelative(0.0f);
        pathBuilder.lineTo(144.49f, 64.0f);
        pathBuilder.lineToRelative(25.42f, -25.41f);
        pathBuilder.arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.82f, 0.0f);
        pathBuilder.lineToRelative(44.69f, 44.68f);
        pathBuilder.arcTo(2.0f, 2.0f, 0.0f, false, true, 217.42f, 86.1f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
