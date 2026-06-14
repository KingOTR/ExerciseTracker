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

/* compiled from: Coathanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"CoatHanger", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/DuotoneGroup;", "getCoatHanger", "(Lcom/adamglin/phosphoricons/DuotoneGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_coatHanger", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CoathangerKt {
    private static ImageVector _coatHanger;

    public static final ImageVector getCoatHanger(DuotoneGroup duotoneGroup) {
        Intrinsics.checkNotNullParameter(duotoneGroup, "<this>");
        ImageVector imageVector = _coatHanger;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("CoatHanger", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(232.0f, 192.0f);
        pathBuilder.horizontalLineTo(24.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.8f, -14.4f);
        pathBuilder.lineTo(128.0f, 96.0f);
        pathBuilder.lineToRelative(108.79f, 81.6f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 0.2f, null, 0.2f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        SolidColor solidColor2 = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw2 = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk82 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os2 = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(241.57f, 171.2f);
        pathBuilder2.lineTo(141.33f, 96.0f);
        pathBuilder2.lineToRelative(23.46f, -17.6f);
        pathBuilder2.arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 72.0f);
        pathBuilder2.arcToRelative(40.0f, 40.0f, 0.0f, true, false, -80.0f, 0.0f);
        pathBuilder2.arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f);
        pathBuilder2.arcToRelative(24.0f, 24.0f, 0.0f, false, true, 47.69f, -3.78f);
        pathBuilder2.lineTo(123.34f, 89.49f);
        pathBuilder2.lineToRelative(-0.28f, 0.22f);
        pathBuilder2.lineTo(14.43f, 171.2f);
        pathBuilder2.arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 200.0f);
        pathBuilder2.horizontalLineTo(232.0f);
        pathBuilder2.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 9.6f, -28.8f);
        pathBuilder2.close();
        pathBuilder2.moveTo(232.0f, 184.0f);
        pathBuilder2.horizontalLineTo(24.0f);
        pathBuilder2.lineToRelative(104.0f, -78.0f);
        pathBuilder2.lineToRelative(104.0f, 78.0f);
        pathBuilder2.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder2.getNodes(), m4126getNonZeroRgk1Os2, "", solidColor2, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw2, m4207getMiterLxFBmk82, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _coatHanger = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
