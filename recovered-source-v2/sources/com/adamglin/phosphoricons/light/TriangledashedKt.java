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

/* compiled from: Triangledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TriangleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getTriangleDashed", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_triangleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriangledashedKt {
    private static ImageVector _triangleDashed;

    public static final ImageVector getTriangleDashed(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _triangleDashed;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("TriangleDashed", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(158.0f, 216.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f);
        pathBuilder.lineTo(104.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(235.07f, 189.09f);
        pathBuilder.lineTo(230.41f, 181.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.4f, 6.0f);
        pathBuilder.lineToRelative(4.66f, 8.09f);
        pathBuilder.arcToRelative(9.49f, 9.49f, 0.0f, false, true, 0.0f, 9.72f);
        pathBuilder.arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, 5.2f);
        pathBuilder.lineTo(192.0f, 210.01f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(23.45f);
        pathBuilder.arcToRelative(22.37f, 22.37f, 0.0f, false, false, 19.6f, -11.19f);
        pathBuilder.arcTo(21.53f, 21.53f, 0.0f, false, false, 235.07f, 189.09f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 210.0f);
        pathBuilder.lineTo(40.55f, 210.0f);
        pathBuilder.arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, -5.2f);
        pathBuilder.arcToRelative(9.49f, 9.49f, 0.0f, false, true, 0.0f, -9.72f);
        pathBuilder.lineTo(36.0f, 187.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.4f, -6.0f);
        pathBuilder.lineToRelative(-4.66f, 8.08f);
        pathBuilder.arcToRelative(21.53f, 21.53f, 0.0f, false, false, 0.0f, 21.72f);
        pathBuilder.arcTo(22.37f, 22.37f, 0.0f, false, false, 40.55f, 222.0f);
        pathBuilder.lineTo(64.0f, 222.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.18f, 150.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, -9.0f);
        pathBuilder.lineToRelative(-23.0f, -40.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, -10.4f, 6.0f);
        pathBuilder.lineToRelative(23.0f, 40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 202.18f, 150.0f);
        pathBuilder.close();
        pathBuilder.moveTo(147.61f, 37.22f);
        pathBuilder.arcToRelative(22.75f, 22.75f, 0.0f, false, false, -39.22f, 0.0f);
        pathBuilder.lineTo(94.69f, 61.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, true, false, 10.4f, 6.0f);
        pathBuilder.lineToRelative(13.7f, -23.78f);
        pathBuilder.arcToRelative(10.75f, 10.75f, 0.0f, false, true, 18.42f, 0.0f);
        pathBuilder.lineTo(150.91f, 67.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.4f, -6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(79.85f, 98.8f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 71.66f, 101.0f);
        pathBuilder.lineToRelative(-23.0f, 40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, true, false, 59.0f, 147.0f);
        pathBuilder.lineToRelative(23.0f, -40.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 79.85f, 98.8f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _triangleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
