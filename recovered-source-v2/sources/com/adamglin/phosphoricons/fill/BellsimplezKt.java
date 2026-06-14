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

/* compiled from: Bellsimplez.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleZ", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/FillGroup;", "getBellSimpleZ", "(Lcom/adamglin/phosphoricons/FillGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleZ", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimplezKt {
    private static ImageVector _bellSimpleZ;

    public static final ImageVector getBellSimpleZ(FillGroup fillGroup) {
        Intrinsics.checkNotNullParameter(fillGroup, "<this>");
        ImageVector imageVector = _bellSimpleZ;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BellSimpleZ", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(168.0f, 224.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f);
        pathBuilder.lineTo(96.0f, 232.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f);
        pathBuilder.close();
        pathBuilder.moveTo(221.85f, 192.0f);
        pathBuilder.arcTo(15.8f, 15.8f, 0.0f, false, true, 208.0f, 200.0f);
        pathBuilder.lineTo(48.0f, 200.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.8f, -24.06f);
        pathBuilder.curveTo(39.75f, 166.38f, 48.0f, 139.34f, 48.0f, 104.0f);
        pathBuilder.arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 35.33f, 8.26f, 62.38f, 13.81f, 71.94f);
        pathBuilder.arcTo(15.89f, 15.89f, 0.0f, false, true, 221.84f, 192.0f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 144.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f);
        pathBuilder.lineTo(127.0f, 136.0f);
        pathBuilder.lineToRelative(23.7f, -35.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 144.0f, 88.0f);
        pathBuilder.lineTo(112.0f, 88.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(17.05f);
        pathBuilder.lineToRelative(-23.7f, 35.56f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 152.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 144.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleZ = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
