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

/* compiled from: Virtualreality.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"VirtualReality", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/ThinGroup;", "getVirtualReality", "(Lcom/adamglin/phosphoricons/ThinGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_virtualReality", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VirtualrealityKt {
    private static ImageVector _virtualReality;

    public static final ImageVector getVirtualReality(ThinGroup thinGroup) {
        Intrinsics.checkNotNullParameter(thinGroup, "<this>");
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
        pathBuilder.moveTo(119.75f, 97.4f);
        pathBuilder.lineToRelative(-24.0f, 64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.5f, 0.0f);
        pathBuilder.lineToRelative(-24.0f, -64.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.5f, -2.8f);
        pathBuilder.lineToRelative(20.25f, 54.0f);
        pathBuilder.lineToRelative(20.25f, -54.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.5f, 2.8f);
        pathBuilder.close();
        pathBuilder.moveTo(252.0f, 128.0f);
        pathBuilder.arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f);
        pathBuilder.lineTo(80.0f, 204.0f);
        pathBuilder.arcTo(76.0f, 76.0f, 0.0f, false, true, 80.0f, 52.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(76.08f, 76.08f, 0.0f, false, true, 252.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(244.0f, 128.0f);
        pathBuilder.arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f);
        pathBuilder.lineTo(80.0f, 60.0f);
        pathBuilder.arcToRelative(68.0f, 68.0f, 0.0f, false, false, 0.0f, 136.0f);
        pathBuilder.horizontalLineToRelative(96.0f);
        pathBuilder.arcTo(68.07f, 68.07f, 0.0f, false, false, 244.0f, 128.0f);
        pathBuilder.close();
        pathBuilder.moveTo(175.5f, 137.06f);
        pathBuilder.lineTo(187.5f, 158.06f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.49f, 5.45f);
        pathBuilder.arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.0f, 0.53f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.47f, -2.0f);
        pathBuilder.lineTo(167.79f, 139.7f);
        pathBuilder.arcToRelative(24.85f, 24.85f, 0.0f, false, true, -3.79f, 0.3f);
        pathBuilder.lineTo(148.0f, 140.0f);
        pathBuilder.verticalLineToRelative(20.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f);
        pathBuilder.lineTo(140.0f, 96.0f);
        pathBuilder.arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f);
        pathBuilder.horizontalLineToRelative(20.0f);
        pathBuilder.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 11.5f, 45.06f);
        pathBuilder.close();
        pathBuilder.moveTo(180.0f, 116.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f);
        pathBuilder.lineTo(148.0f, 100.0f);
        pathBuilder.verticalLineToRelative(32.0f);
        pathBuilder.horizontalLineToRelative(16.0f);
        pathBuilder.arcTo(16.0f, 16.0f, 0.0f, false, false, 180.0f, 116.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _virtualReality = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
