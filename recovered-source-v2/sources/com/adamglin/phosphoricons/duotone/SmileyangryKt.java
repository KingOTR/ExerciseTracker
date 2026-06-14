package com.adamglin.phosphoricons.duotone;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import com.adamglin.phosphoricons.DuotoneGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Smileyangry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"SmileyAngry", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getSmileyAngry", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_smileyAngry", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SmileyangryKt {
    private static ImageVector _smileyAngry;

    public static final ImageVector getSmileyAngry(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _smileyAngry;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("SmileyAngry", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 128.0f);
        pathBuilder.arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f);
        pathBuilder.arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(92.0f, 152.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 152.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(164.0f, 128.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 128.0f);
        pathBuilder2.arcTo(104.0f, 104.0f, 0.0f, true, true, 128.0f, 24.0f);
        pathBuilder2.arcTo(104.11f, 104.11f, 0.0f, false, true, 232.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(216.0f, 128.0f);
        pathBuilder2.arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f);
        pathBuilder2.arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(171.56f, 81.34f);
        pathBuilder2.lineTo(128.0f, 110.39f);
        pathBuilder2.lineToRelative(-43.56f, -29.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.88f, 13.32f);
        pathBuilder2.lineToRelative(48.0f, 32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.88f, 0.0f);
        pathBuilder2.lineToRelative(48.0f, -32.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.88f, -13.32f);
        pathBuilder2.close();
        pathBuilder2.moveTo(156.43f, 177.34f);
        pathBuilder2.curveTo(148.0f, 171.73f, 139.94f, 168.0f, 128.0f, 168.0f);
        pathBuilder2.reflectiveCurveToRelative(-20.0f, 3.73f, -28.43f, 9.34f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.86f, 13.32f);
        pathBuilder2.curveTo(114.93f, 186.34f, 120.0f, 184.0f, 128.0f, 184.0f);
        pathBuilder2.reflectiveCurveToRelative(13.07f, 2.34f, 19.57f, 6.66f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.86f, -13.32f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _smileyAngry = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
