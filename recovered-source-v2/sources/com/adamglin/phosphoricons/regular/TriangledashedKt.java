package com.adamglin.phosphoricons.regular;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.RegularGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Triangledashed.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"TriangleDashed", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getTriangleDashed", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_triangleDashed", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriangledashedKt {
    private static ImageVector _triangleDashed;

    public static final ImageVector getTriangleDashed(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
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
        pathBuilder.moveTo(160.0f, 216.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(104.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(48.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 216.0f);
        pathBuilder.close();
        pathBuilder.moveTo(236.8f, 188.09f);
        pathBuilder.lineTo(232.14f, 180.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder.lineToRelative(4.65f, 8.09f);
        pathBuilder.arcToRelative(7.59f, 7.59f, 0.0f, false, true, 0.0f, 7.72f);
        pathBuilder.arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, 4.2f);
        pathBuilder.lineTo(192.0f, 208.01f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(23.45f);
        pathBuilder.arcToRelative(24.34f, 24.34f, 0.0f, false, false, 21.33f, -12.19f);
        pathBuilder.arcTo(23.51f, 23.51f, 0.0f, false, false, 236.8f, 188.09f);
        pathBuilder.close();
        pathBuilder.moveTo(64.0f, 208.0f);
        pathBuilder.lineTo(40.55f, 208.0f);
        pathBuilder.arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.48f, -4.2f);
        pathBuilder.arcToRelative(7.59f, 7.59f, 0.0f, false, true, 0.0f, -7.72f);
        pathBuilder.lineTo(37.72f, 188.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.86f, -8.0f);
        pathBuilder.lineToRelative(-4.66f, 8.08f);
        pathBuilder.arcToRelative(23.51f, 23.51f, 0.0f, false, false, 0.0f, 23.72f);
        pathBuilder.arcTo(24.34f, 24.34f, 0.0f, false, false, 40.55f, 224.0f);
        pathBuilder.lineTo(64.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.close();
        pathBuilder.moveTo(202.18f, 152.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.93f, -12.0f);
        pathBuilder.lineToRelative(-23.0f, -40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f);
        pathBuilder.lineToRelative(23.0f, 40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 202.18f, 152.0f);
        pathBuilder.close();
        pathBuilder.moveTo(149.35f, 36.22f);
        pathBuilder.arcToRelative(24.76f, 24.76f, 0.0f, false, false, -42.7f, 0.0f);
        pathBuilder.lineTo(93.0f, 60.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.86f, 8.0f);
        pathBuilder.lineToRelative(13.7f, -23.78f);
        pathBuilder.arcToRelative(8.75f, 8.75f, 0.0f, false, true, 15.0f, 0.0f);
        pathBuilder.lineTo(149.18f, 68.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.94f, 4.0f);
        pathBuilder.arcToRelative(7.91f, 7.91f, 0.0f, false, false, 4.0f, -1.07f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 163.0f, 60.0f);
        pathBuilder.close();
        pathBuilder.moveTo(80.85f, 97.07f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 69.93f, 100.0f);
        pathBuilder.lineToRelative(-23.0f, 40.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.87f, 8.0f);
        pathBuilder.lineToRelative(23.0f, -40.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 80.85f, 97.07f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _triangleDashed = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
