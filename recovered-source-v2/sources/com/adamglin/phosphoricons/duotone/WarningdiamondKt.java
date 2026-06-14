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

/* compiled from: Warningdiamond.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"WarningDiamond", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getWarningDiamond", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_warningDiamond", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WarningdiamondKt {
    private static ImageVector _warningDiamond;

    public static final ImageVector getWarningDiamond(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _warningDiamond;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("WarningDiamond", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(229.67f, 133.62f);
        pathBuilder.lineToRelative(-96.0f, 96.0f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, true, -11.24f, 0.0f);
        pathBuilder.lineToRelative(-96.0f, -96.0f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, true, 0.0f, -11.24f);
        pathBuilder.lineToRelative(96.05f, -96.0f);
        pathBuilder.arcToRelative(7.94f, 7.94f, 0.0f, false, true, 11.24f, 0.0f);
        pathBuilder.lineToRelative(96.0f, 96.05f);
        pathBuilder.arcTo(7.94f, 7.94f, 0.0f, false, true, 229.67f, 133.62f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(128.0f, 72.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f);
        pathBuilder2.verticalLineToRelative(56.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f);
        pathBuilder2.lineTo(120.0f, 80.0f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 72.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(116.0f, 172.0f);
        pathBuilder2.arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f);
        pathBuilder2.arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 172.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(240.0f, 128.0f);
        pathBuilder2.arcToRelative(15.85f, 15.85f, 0.0f, false, true, -4.67f, 11.28f);
        pathBuilder2.lineToRelative(-96.05f, 96.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, -22.56f, 0.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.lineToRelative(-96.0f, -96.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -22.56f);
        pathBuilder2.lineToRelative(96.05f, -96.06f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, true, 22.56f, 0.0f);
        pathBuilder2.lineToRelative(96.05f, 96.06f);
        pathBuilder2.arcTo(15.85f, 15.85f, 0.0f, false, true, 240.0f, 128.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(224.0f, 128.0f);
        pathBuilder2.lineTo(128.0f, 32.0f);
        pathBuilder2.lineTo(32.0f, 128.0f);
        pathBuilder2.lineTo(128.0f, 224.0f);
        pathBuilder2.horizontalLineToRelative(0.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _warningDiamond = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
