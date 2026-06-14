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

/* compiled from: Virtualreality.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VirtualReality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getVirtualReality", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virtualReality", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirtualrealityKt {
    private static ImageVector _virtualReality;

    public static final ImageVector getVirtualReality(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _virtualReality;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("VirtualReality", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(123.49f, 98.81f);
        pathBuilder.lineToRelative(-24.0f, 64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.0f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, -64.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, -5.62f);
        pathBuilder.lineToRelative(16.51f, 44.0f);
        pathBuilder.lineToRelative(16.51f, -44.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.0f, 5.62f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 128.0f);
        pathBuilder.arcToRelative(80.09f, 80.09f, 0.0f, false, true, -80.0f, 80.0f);
        pathBuilder.lineTo(80.0f, 208.0f);
        pathBuilder.arcTo(80.0f, 80.0f, 0.0f, false, true, 80.0f, 48.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(80.09f, 80.09f, 0.0f, false, true, 256.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(240.0f, 128.0f);
        pathBuilder.arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, -64.0f);
        pathBuilder.lineTo(80.0f, 64.0f);
        pathBuilder.arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(64.07f, 64.07f, 0.0f, false, false, 240.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(180.84f, 138.35f);
        pathBuilder.lineTo(191.0f, 156.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.9f, 7.94f);
        pathBuilder.lineToRelative(-11.44f, -20.0f);
        pathBuilder.curveToRelative(-0.53f, 0.0f, -1.07f, 0.05f, -1.61f, 0.05f);
        pathBuilder.lineTo(152.0f, 143.99f);
        pathBuilder.verticalLineToRelative(16.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 96.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(28.0f, 28.0f, 0.0f, false, true, 16.84f, 50.35f);
        pathBuilder.close();
        pathBuilder.moveTo(152.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(12.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f);
        pathBuilder.lineTo(152.0f, 104.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virtualReality = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
