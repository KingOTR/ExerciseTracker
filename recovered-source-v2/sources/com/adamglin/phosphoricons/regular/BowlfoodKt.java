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

/* compiled from: Bowlfood.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"BowlFood", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Lcom/adamglin/phosphoricons/RegularGroup;", "getBowlFood", "(Lcom/adamglin/phosphoricons/RegularGroup;)Landroidx/compose/ui/graphics/vector/ImageVector;", "_bowlFood", "phosphor_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BowlfoodKt {
    private static ImageVector _bowlFood;

    public static final ImageVector getBowlFood(RegularGroup regularGroup) {
        Intrinsics.checkNotNullParameter(regularGroup, "<this>");
        ImageVector imageVector = _bowlFood;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        float f = (float) 24.0d;
        ImageVector.Builder builder = new ImageVector.Builder("BowlFood", Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 256.0f, 256.0f, 0L, 0, false, 224, null);
        SolidColor solidColor = new SolidColor(ColorKt.Color(4278190080L), null);
        int m4196getButtKaPHkGw = StrokeCap.INSTANCE.m4196getButtKaPHkGw();
        int m4207getMiterLxFBmk8 = StrokeJoin.INSTANCE.m4207getMiterLxFBmk8();
        int m4126getNonZeroRgk1Os = PathFillType.INSTANCE.m4126getNonZeroRgk1Os();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(224.0f, 104.0f);
        pathBuilder.horizontalLineToRelative(-8.37f);
        pathBuilder.arcToRelative(88.0f, 88.0f, 0.0f, false, false, -175.26f, 0.0f);
        pathBuilder.lineTo(32.0f, 104.0f);
        pathBuilder.arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f);
        pathBuilder.arcToRelative(104.35f, 104.35f, 0.0f, false, false, 56.0f, 92.28f);
        pathBuilder.lineTo(80.0f, 208.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f);
        pathBuilder.horizontalLineToRelative(64.0f);
        pathBuilder.arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f);
        pathBuilder.verticalLineToRelative(-3.72f);
        pathBuilder.arcTo(104.35f, 104.35f, 0.0f, false, false, 232.0f, 112.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(199.54f, 104.0f);
        pathBuilder.lineTo(148.12f, 104.0f);
        pathBuilder.arcToRelative(71.84f, 71.84f, 0.0f, false, true, 41.27f, -29.57f);
        pathBuilder.arcTo(71.45f, 71.45f, 0.0f, false, true, 199.54f, 104.0f);
        pathBuilder.close();
        pathBuilder.moveTo(173.48f, 56.23f);
        pathBuilder.quadToRelative(2.75f, 2.25f, 5.27f, 4.75f);
        pathBuilder.arcToRelative(87.92f, 87.92f, 0.0f, false, false, -49.15f, 43.0f);
        pathBuilder.lineTo(100.1f, 103.98f);
        pathBuilder.arcTo(72.26f, 72.26f, 0.0f, false, true, 168.0f, 56.0f);
        pathBuilder.curveTo(169.83f, 56.0f, 171.66f, 56.09f, 173.48f, 56.23f);
        pathBuilder.close();
        pathBuilder.moveTo(128.0f, 40.0f);
        pathBuilder.arcToRelative(71.87f, 71.87f, 0.0f, false, true, 19.0f, 2.57f);
        pathBuilder.arcTo(88.36f, 88.36f, 0.0f, false, false, 83.33f, 104.0f);
        pathBuilder.lineTo(56.46f, 104.0f);
        pathBuilder.arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 40.0f);
        pathBuilder.close();
        pathBuilder.moveTo(164.66f, 192.0f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 199.3f);
        pathBuilder.lineTo(160.0f, 208.0f);
        pathBuilder.lineTo(96.0f, 208.0f);
        pathBuilder.verticalLineToRelative(-8.7f);
        pathBuilder.arcTo(8.0f, 8.0f, 0.0f, false, false, 91.34f, 192.0f);
        pathBuilder.arcToRelative(88.29f, 88.29f, 0.0f, false, true, -51.0f, -72.0f);
        pathBuilder.lineTo(215.63f, 120.0f);
        pathBuilder.arcTo(88.29f, 88.29f, 0.0f, false, true, 164.66f, 192.0f);
        pathBuilder.close();
        ImageVector.Builder.m4534addPathoIyEayM$default(builder, pathBuilder.getNodes(), m4126getNonZeroRgk1Os, "", solidColor, 1.0f, null, 1.0f, 0.0f, m4196getButtKaPHkGw, m4207getMiterLxFBmk8, 4.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector build = builder.build();
        _bowlFood = build;
        Intrinsics.checkNotNull(build);
        return build;
    }
}
