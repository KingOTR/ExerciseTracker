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

/* compiled from: Virtualreality.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VirtualReality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/BoldGroup;", "getVirtualReality", "(Lcom/adamglin/phosphoricons/BoldGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virtualReality", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirtualrealityKt {
    private static ImageVector _virtualReality;

    public static final ImageVector getVirtualReality(BoldGroup boldGroup) {
        Intrinsics.checkNotNullParameter(boldGroup, "<this>");
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
        pathBuilder.moveTo(127.0f, 104.73f);
        pathBuilder.lineToRelative(-24.0f, 56.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.06f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, -56.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 79.0f, 95.27f);
        pathBuilder.lineToRelative(13.0f, 30.27f);
        pathBuilder.lineToRelative(13.0f, -30.27f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, false, true, 127.0f, 104.73f);
        pathBuilder.close();
        pathBuilder.moveTo(256.0f, 128.0f);
        pathBuilder.arcToRelative(84.09f, 84.09f, 0.0f, false, true, -84.0f, 84.0f);
        pathBuilder.lineTo(84.0f, 212.0f);
        pathBuilder.arcTo(84.0f, 84.0f, 0.0f, false, true, 84.0f, 44.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcTo(84.09f, 84.09f, 0.0f, false, true, 256.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(232.0f, 128.0f);
        pathBuilder.arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f);
        pathBuilder.lineTo(84.0f, 68.0f);
        pathBuilder.arcToRelative(60.0f, 60.0f, 0.0f, false, false, 0.0f, 120.0f);
        pathBuilder.horizontalLineToRelative(88.0f);
        pathBuilder.arcTo(60.07f, 60.07f, 0.0f, false, false, 232.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(200.0f, 120.0f);
        pathBuilder.arcToRelative(31.85f, 31.85f, 0.0f, false, true, -7.93f, 21.05f);
        pathBuilder.lineToRelative(5.69f, 8.0f);
        pathBuilder.arcTo(12.0f, 12.0f, 0.0f, true, true, 178.24f, 163.0f);
        pathBuilder.lineToRelative(-7.91f, -11.06f);
        pathBuilder.curveToRelative(-0.77f, 0.05f, -1.55f, 0.09f, -2.33f, 0.09f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f);
        pathBuilder.lineTo(136.0f, 100.0f);
        pathBuilder.arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcTo(32.0f, 32.0f, 0.0f, false, true, 200.0f, 120.0f);
        pathBuilder.close();
        pathBuilder.moveTo(160.0f, 128.0f);
        pathBuilder.horizontalLineToRelative(8.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f);
        pathBuilder.horizontalLineToRelative(-8.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virtualReality = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
