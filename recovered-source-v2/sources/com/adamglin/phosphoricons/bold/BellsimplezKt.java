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

/* compiled from: Bellsimplez.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BellSimpleZ", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getBellSimpleZ", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bellSimpleZ", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BellsimplezKt {
    private static ImageVector _bellSimpleZ;

    public static final ImageVector getBellSimpleZ(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(156.0f, 140.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f);
        pathBuilder.lineTo(112.0f, 152.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.0f, -18.66f);
        pathBuilder.lineTo(121.58f, 104.0f);
        pathBuilder.lineTo(112.0f, 104.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, -24.0f);
        pathBuilder.horizontalLineToRelative(32.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.0f, 18.66f);
        pathBuilder.lineTo(134.42f, 128.0f);
        pathBuilder.lineTo(144.0f, 128.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 140.0f);
        pathBuilder.close();
        pathBuilder.moveTo(225.33f, 186.0f);
        pathBuilder.arcTo(19.77f, 19.77f, 0.0f, false, true, 208.0f, 196.0f);
        pathBuilder.lineTo(48.0f, 196.0f);
        pathBuilder.arcToRelative(19.77f, 19.77f, 0.0f, false, true, -17.31f, -10.0f);
        pathBuilder.arcToRelative(20.08f, 20.08f, 0.0f, false, true, 0.05f, -20.06f);
        pathBuilder.curveTo(39.39f, 151.0f, 44.0f, 129.58f, 44.0f, 104.0f);
        pathBuilder.arcToRelative(84.0f, 84.0f, 0.0f, false, true, 168.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 25.57f, 4.59f, 47.0f, 13.27f, 61.93f);
        pathBuilder.arcTo(20.08f, 20.08f, 0.0f, false, true, 225.34f, 186.0f);
        pathBuilder.close();
        pathBuilder.moveTo(201.33f, 172.0f);
        pathBuilder.curveTo(192.49f, 154.0f, 188.0f, 131.13f, 188.0f, 104.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, -120.0f, 0.0f);
        pathBuilder.curveToRelative(0.0f, 27.14f, -4.48f, 50.0f, -13.33f, 68.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 212.0f);
        pathBuilder.lineTo(96.0f, 212.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bellSimpleZ = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
