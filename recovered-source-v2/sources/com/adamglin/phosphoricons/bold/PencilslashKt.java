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

/* compiled from: Pencilslash.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilSlash", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getPencilSlash", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilSlash", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilslashKt {
    private static ImageVector _pencilSlash;

    public static final ImageVector getPencilSlash(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(56.88f, 31.93f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f);
        pathBuilder.lineToRelative(45.64f, 50.2f);
        pathBuilder.lineToRelative(-50.9f, 50.9f);
        pathBuilder.arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 163.31f);
        pathBuilder.lineTo(28.0f, 208.0f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f);
        pathBuilder.lineTo(92.69f, 228.0f);
        pathBuilder.arcToRelative(19.85f, 19.85f, 0.0f, false, false, 14.14f, -5.86f);
        pathBuilder.lineToRelative(47.43f, -47.42f);
        pathBuilder.lineToRelative(44.87f, 49.35f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, -16.14f);
        pathBuilder.close();
        pathBuilder.moveTo(111.43f, 127.61f);
        pathBuilder.lineTo(72.0f, 167.0f);
        pathBuilder.lineTo(61.0f, 156.0f);
        pathBuilder.lineToRelative(40.0f, -39.95f);
        pathBuilder.close();
        pathBuilder.moveTo(52.0f, 181.0f);
        pathBuilder.lineToRelative(23.0f, 23.0f);
        pathBuilder.lineTo(52.0f, 204.0f);
        pathBuilder.close();
        pathBuilder.moveTo(100.0f, 195.0f);
        pathBuilder.lineTo(89.0f, 184.0f);
        pathBuilder.lineToRelative(38.62f, -38.62f);
        pathBuilder.lineToRelative(10.51f, 11.56f);
        pathBuilder.close();
        pathBuilder.moveTo(230.15f, 70.54f);
        pathBuilder.lineTo(185.46f, 25.86f);
        pathBuilder.arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f);
        pathBuilder.lineToRelative(-36.0f, 36.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.55f, 18.82f);
        pathBuilder.lineTo(147.08f, 92.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 108.93f);
        pathBuilder.lineTo(175.0f, 120.0f);
        pathBuilder.lineToRelative(-0.54f, 0.53f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f);
        pathBuilder.lineToRelative(38.67f, -38.67f);
        pathBuilder.arcTo(20.0f, 20.0f, 0.0f, false, false, 230.15f, 70.54f);
        pathBuilder.close();
        pathBuilder.moveTo(192.0f, 103.0f);
        pathBuilder.lineTo(153.0f, 64.0f);
        pathBuilder.lineToRelative(18.34f, -18.34f);
        pathBuilder.lineToRelative(39.0f, 39.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilSlash = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
