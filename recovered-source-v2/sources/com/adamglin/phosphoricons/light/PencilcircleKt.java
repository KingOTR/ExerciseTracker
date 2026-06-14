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

/* compiled from: Pencilcircle.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"PencilCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/LightGroup;", "getPencilCircle", "(Lcom/adamglin/phosphoricons/LightGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_pencilCircle", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PencilcircleKt {
    private static ImageVector _pencilCircle;

    public static final ImageVector getPencilCircle(LightGroup lightGroup) {
        Intrinsics.checkNotNullParameter(lightGroup, "<this>");
        ImageVector imageVector = _pencilCircle;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("PencilCircle", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(200.12f, 55.87f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.12f);
        pathBuilder.arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.87f);
        pathBuilder.close();
        pathBuilder.moveTo(106.0f, 134.0f);
        pathBuilder.horizontalLineToRelative(44.0f);
        pathBuilder.lineToRelative(14.1f, 30.56f);
        pathBuilder.arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 174.0f);
        pathBuilder.arcToRelative(30.0f, 30.0f, 0.0f, false, false, -36.11f, -9.46f);
        pathBuilder.close();
        pathBuilder.moveTo(111.54f, 122.0f);
        pathBuilder.lineTo(128.0f, 86.32f);
        pathBuilder.lineTo(144.47f, 122.0f);
        pathBuilder.close();
        pathBuilder.moveTo(134.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.verticalLineToRelative(15.64f);
        pathBuilder.arcToRelative(89.26f, 89.26f, 0.0f, false, true, -36.0f, 10.14f);
        pathBuilder.close();
        pathBuilder.moveTo(86.0f, 192.0f);
        pathBuilder.arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f);
        pathBuilder.verticalLineToRelative(25.78f);
        pathBuilder.arcToRelative(89.26f, 89.26f, 0.0f, false, true, -36.0f, -10.14f);
        pathBuilder.close();
        pathBuilder.moveTo(191.64f, 191.64f);
        pathBuilder.arcTo(92.76f, 92.76f, 0.0f, false, true, 182.0f, 200.0f);
        pathBuilder.lineTo(182.0f, 176.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.55f, -2.51f);
        pathBuilder.lineToRelative(-48.0f, -104.0f);
        pathBuilder.arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.9f, 0.0f);
        pathBuilder.lineToRelative(-48.0f, 104.0f);
        pathBuilder.arcTo(6.0f, 6.0f, 0.0f, false, false, 74.0f, 176.0f);
        pathBuilder.verticalLineToRelative(24.0f);
        pathBuilder.arcToRelative(92.76f, 92.76f, 0.0f, false, true, -9.64f, -8.37f);
        pathBuilder.arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.28f, 0.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _pencilCircle = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
